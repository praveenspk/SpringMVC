package com.spk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spk.beans.EmpBO;
import com.spk.dao.EmpDAO;
import com.spk.dao.EmpDAOImpl;
import com.spk.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService {
	
	private EmpDAO dao;
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}
    	
		public List<EmpDTO> getEmps() {
		List<EmpBO> listBo=dao.getEmpRecords();
		List<EmpDTO> listDto=new ArrayList<EmpDTO>();
		for(EmpBO bo:listBo) {
			EmpDTO empDto=new EmpDTO(bo.getId(), bo.getEname(), bo.getJob(), bo.getSal());
			listDto.add(empDto);
		}
	return listDto;
	}
}
