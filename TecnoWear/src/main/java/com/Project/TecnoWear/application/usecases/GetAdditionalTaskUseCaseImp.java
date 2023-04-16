package com.Project.TecnoWear.application.usecases;

import com.Project.TecnoWear.Domain.models.AdditionalTaskInfo;
import com.Project.TecnoWear.Domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.Project.TecnoWear.Domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskUseCaseImp implements GetAdditionalTaskInfoUseCase {
    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskUseCaseImp(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long Id) {
        return externalServicePort.getAdditionalTaskInfo(Id);
    }
}
