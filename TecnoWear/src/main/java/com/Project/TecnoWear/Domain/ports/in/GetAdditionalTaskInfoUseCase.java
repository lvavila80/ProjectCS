package com.Project.TecnoWear.Domain.ports.in;

import com.Project.TecnoWear.Domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long Id);

}
