package com.yupi.nojcodesandbox;

import com.yupi.nojcodesandbox.model.ExecuteCodeRequest;
import com.yupi.nojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface  CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
