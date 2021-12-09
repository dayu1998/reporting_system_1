package com.antra.report.client.pojo.reponse.service;

import com.antra.report.client.pojo.reponse.pojo.request.ReportRequest;

public interface SNSService {
    void sendReportNotification(ReportRequest request);
}
