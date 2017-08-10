package com.kbers.warehouse;

import com.amzass.service.common.ApplicationContext;
import org.testng.annotations.Test;

public class ExecutorTest {

    @Test
    void dbManage() {
        Executor nj = ApplicationContext.getBean(Executor.class);
        nj.readSpreadIdAccEmail("38US|1_e5lFtIz7NsEDuU-9jOinubHxbxNV0ww2dGJt-e1pwM|followjidu@gmail.com", false, false);
    }

}