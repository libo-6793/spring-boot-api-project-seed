package com.company.project.service.impl;

import com.company.project.dao.UnionorderMapper;
import com.company.project.model.Unionorder;
import com.company.project.service.UnionorderService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/08.
 */
@Service
@Transactional
public class UnionorderServiceImpl extends AbstractService<Unionorder> implements UnionorderService {
    @Resource
    private UnionorderMapper unionorderMapper;

}
