package com.neon.mall.service;

import com.neon.mall.model.vo.CartVO;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * 描述：     邮件Service
 */

public interface EmailService {

    void sendSimpleMessage(String to, String subject, String text);

    Boolean saveEmailToRedis(String emailAddress, String verificationCode);

    Boolean checkEmailAndCode(String emailAddress, String verificationCode);
}
