package org.introsoftengi.termprojectharrison.serviceimpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.introsoftengi.termprojectharrison.enums.ResponseStatus;
import org.introsoftengi.termprojectharrison.models.InstructionsEntity;
import org.introsoftengi.termprojectharrison.repository.InstructionsRepository;
import org.introsoftengi.termprojectharrison.service.InstructionsService;
import org.introsoftengi.termprojectharrison.vo.ResponseVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class InstructionsServiceImpl implements InstructionsService {
    private final InstructionsRepository instructionsRepository;

    @Override
    public ResponseVO fetchAllInstructions() {
        ResponseVO<List<InstructionsEntity>> responseVO = new ResponseVO<>();
        responseVO.setResponseStatus(ResponseStatus.SUCCESS);
        responseVO.setData(instructionsRepository.findAll());
        return responseVO;
    }
}
