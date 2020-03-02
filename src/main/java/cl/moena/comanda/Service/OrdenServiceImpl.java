package cl.moena.comanda.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.moena.comanda.Model.Orden;
import cl.moena.comanda.Repository.OrdenRepository;

@Service
public class OrdenServiceImpl implements OrdenService{

	@Autowired
	OrdenRepository ordenRepository;
	
	@Override
	public Orden post(Orden objeto) {
		return ordenRepository.save(objeto);
	}

	@Override
	public List<Orden> get() {
		return ordenRepository.findAll();
	}

}
