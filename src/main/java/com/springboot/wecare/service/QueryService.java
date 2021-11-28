package com.springboot.wecare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.wecare.model.Query;
import com.springboot.wecare.repository.QueryRepository;

@Service
public class QueryService implements IqueryService {
	@Autowired
	QueryRepository queryRepository;

	@Transactional
	public List<Query> getAll() {
		return queryRepository.findAll();

	}

	@Transactional
	public String addQuery(Query query) {

		try {
			queryRepository.save(query);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Query Saved";
	}

	@Transactional
	public String updateQuery(Query query) {

		Optional<Query> searchRecord = queryRepository.findByQueryId(query.getQueryId());
		if (searchRecord.isPresent()) {
			try {

				Query updateQuery = searchRecord.get();

				updateQuery.setQueryDescription(query.getQueryDescription());
				updateQuery.setIsQueryAnswered(query.getIsQueryAnswered());
				updateQuery.setQueryResponse(query.getQueryResponse());
				updateQuery.setCaregiverID(query.getCaregiverID());
				updateQuery.setClientID(query.getClientID());
				updateQuery.setManagerID(query.getManagerID());

				queryRepository.save(updateQuery);

			} catch (Exception e) {
				return e.getMessage();
			}
		} else {
			return "Query does not exist.";
		}
		return "Query Updated";
	}

	@Transactional
	public String deleteQuery(Long queryID) {
		try {
			Optional<Query> query = queryRepository.findByQueryId(queryID);
			queryRepository.delete(query.get());
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Query Deleted";
	}
}
