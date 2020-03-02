package cl.moena.comanda.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.moena.comanda.Model.TipoPago;
import cl.moena.comanda.Repository.TipoPagoRepository;

@Service
public class TipoPagoServiceImpl implements TipoPagoService{

	@Autowired
	TipoPagoRepository tipoPagoRepository;

	@Override
	public TipoPago post(TipoPago objeto) {
		return tipoPagoRepository.save(objeto);
	}

	@Override
	public List<TipoPago> get() {
		return tipoPagoRepository.findAll();
	}
	
	
}
