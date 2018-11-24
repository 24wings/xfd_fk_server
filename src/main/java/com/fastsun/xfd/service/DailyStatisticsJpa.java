package com.fastsun.xfd.service;

import org.springframework.stereotype.Service;

import com.fastsun.xfd.entity.DailyStatistics;

import org.springframework.data.repository.CrudRepository;

@Service()
public interface DailyStatisticsJpa extends CrudRepository<DailyStatistics, Long> {

}