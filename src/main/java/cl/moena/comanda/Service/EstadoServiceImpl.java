package cl.moena.comanda.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.moena.comanda.Model.Estado;
import cl.moena.comanda.Repository.EstadoRepository;

@Service
public class EstadoServiceImpl implements EstadoService{

	@Autowired
	EstadoRepository estadoRepository;
	
	@Override
	public Estado post(Estado objeto) {
		return estadoRepository.save(objeto);
	}

	@Override
	public List<Estado> get() {
		return estadoRepository.findAll();
	}

}
