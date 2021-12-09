package com.antra.report.client.pojo.reponse.repository;

import com.antra.report.client.pojo.reponse.entity.ReportRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRequestRepo extends JpaRepository<ReportRequestEntity, String> {
}
