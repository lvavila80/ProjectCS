package com.Project.TecnoWear.Domain.ports.out;

import com.Project.TecnoWear.Domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
