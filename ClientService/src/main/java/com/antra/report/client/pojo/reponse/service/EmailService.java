package com.antra.report.client.pojo.reponse.service;

import com.antra.report.client.pojo.reponse.pojo.EmailType;

public interface EmailService {
    void sendEmail(String to, EmailType success, String submitter);
}
