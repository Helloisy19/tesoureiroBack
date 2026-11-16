package igreja.service;


import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import igreja.entity.Despesas;
import igreja.entity.Entradas;
import igreja.repository.DespesasRepository;
import igreja.repository.EntradaRepository;

@Service
public class SaldoService {

	private final EntradaRepository entradaRepository;
	private final DespesasRepository despesasRepository;
	
	public SaldoService(EntradaRepository entradaRepository, DespesasRepository despesasRepository) {
		super();
		this.entradaRepository = entradaRepository;
		this.despesasRepository = despesasRepository;
	}
	
	public BigDecimal calcularSaldo() {
		
		BigDecimal totalEntradas = BigDecimal.ZERO;
		
		for(Entradas entrada :entradaRepository.findAll()) {
			if (entrada.getValor() !=null) {
				totalEntradas = totalEntradas.add(entrada.getValor());
			}
		}
		
		BigDecimal totalDespesas = BigDecimal.ZERO;
		
		for(Despesas despesa :despesasRepository.findAll()) {
			if(despesa.getValor() !=null) {
				totalDespesas = totalDespesas.add(despesa.getValor());
			}
		}
		
		return totalEntradas.subtract(totalDespesas);
	}
	
}
