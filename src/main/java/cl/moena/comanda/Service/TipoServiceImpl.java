package cl.moena.comanda.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.moena.comanda.Model.Tipo;
import cl.moena.comanda.Repository.TipoRepository;

@Service
public class TipoServiceImpl implements TipoService{

	@Autowired
	TipoRepository tipoRepository;
	
	@Override
	public Tipo postTipo(Tipo tipo) {
		
		return tipoRepository.save(tipo);
	}

	@Override
	public List<Tipo> get() {
		return tipoRepository.findAll();
	}

}
