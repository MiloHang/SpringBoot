package com.hss.spring.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */
@Service
@Conditional(WindowsCondition.class)
public class WindowsService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
