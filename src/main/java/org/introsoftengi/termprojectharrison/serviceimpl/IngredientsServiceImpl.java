package org.introsoftengi.termprojectharrison.serviceimpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.introsoftengi.termprojectharrison.enums.ResponseStatus;
import org.introsoftengi.termprojectharrison.models.IngredientsEntity;
import org.introsoftengi.termprojectharrison.repository.IngredientsRepository;
import org.introsoftengi.termprojectharrison.service.IngredientsService;
import org.introsoftengi.termprojectharrison.vo.ResponseVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class IngredientsServiceImpl implements IngredientsService {
    private final IngredientsRepository ingredientsRepository;

    @Override
    public ResponseVO fetchAllIngredients() {
        ResponseVO<List<IngredientsEntity>> responseVO = new ResponseVO<>();
        responseVO.setResponseStatus(ResponseStatus.SUCCESS);
        responseVO.setData(ingredientsRepository.findAll());
        return responseVO;
    }
}
