package com.antra.report.client.pojo.reponse.service;

import com.antra.report.client.pojo.reponse.pojo.FileType;
import com.antra.report.client.pojo.reponse.pojo.reponse.ReportVO;
import com.antra.report.client.pojo.reponse.pojo.reponse.SqsResponse;
import com.antra.report.client.pojo.reponse.pojo.request.ReportRequest;

import java.io.InputStream;
import java.util.List;

public interface ReportService {
    ReportVO generateReportsSync(ReportRequest request);

    ReportVO generateReportsAsync(ReportRequest request);

    void updateAsyncPDFReport(SqsResponse response);

    void updateAsyncExcelReport(SqsResponse response);

    List<ReportVO> getReportList();

    InputStream getFileBodyByReqId(String reqId, FileType type);
}
