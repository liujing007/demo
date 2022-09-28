package com.example.demo.service.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author woshijing
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年09月28日 11:20:00
 */
@RestController
@RequestMapping(value = "/workspace")
@Slf4j
public class ClientDemo {

//    @Autowired
//    private AnalysisFeignClient analysisFeignClient;
//
//
//    @GetMapping(value = "/demo1")
//    public BaseResponse<Long> demo(@RequestParam Long workspaceId, @RequestParam Long cubeId, @RequestParam String analysisName) {
//        AnalysisClientRequest analysisClientRequest = new AnalysisClientRequest();
//        analysisClientRequest.setCubeId(cubeId);
//        analysisClientRequest.setAnalysisName(analysisName);
//        BaseResponse<Long> analysis = analysisFeignClient.createAnalysis(workspaceId, analysisClientRequest);
//        return BaseResponse.ok(analysis.getContent());
//    }
//
//    @GetMapping(value = "/demo2")
//    public BaseResponse<Void> demo2(@RequestParam Long analysisId) {
//        BaseResponse<Void> voidBaseResponse = analysisFeignClient.deleteAnalysis(analysisId);
//        return BaseResponse.ok(null);
//    }


}
