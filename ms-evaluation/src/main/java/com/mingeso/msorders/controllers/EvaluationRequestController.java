package com.mingeso.msorders.controllers;

import com.mingeso.msorders.entities.CreditEvaluationEntity;
import com.mingeso.msorders.services.EvaluationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/evaluation")
public class EvaluationRequestController {

    @Autowired
    private EvaluationRequestService evaluateRequestService;

    @PostMapping("/dataEvaluation")
    public ResponseEntity<?> dataEvaluation(@RequestBody CreditEvaluationEntity evaluation) {
        return ResponseEntity.ok(evaluateRequestService.evaluateCredit(evaluation));
    }
}



