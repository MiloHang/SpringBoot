package com.hss.spring.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */
@Service
@Conditional(LinuxCondition.class)
public class LinuxService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
