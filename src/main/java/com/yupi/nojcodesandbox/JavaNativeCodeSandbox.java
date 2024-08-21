package com.yupi.nojcodesandbox;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.dfa.WordTree;
import com.yupi.nojcodesandbox.model.ExecuteCodeRequest;
import com.yupi.nojcodesandbox.model.ExecuteCodeResponse;
import com.yupi.nojcodesandbox.model.ExecuteMessage;
import com.yupi.nojcodesandbox.model.JudgeInfo;
import com.yupi.nojcodesandbox.utils.ProcessUtils;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
/**
 * Java 原生代码沙箱实现（直接复用模板方法）
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate{
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }

}
