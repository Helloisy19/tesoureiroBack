package igreja.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import igreja.service.RelatorioService;

@RestController
@RequestMapping("/tesouraria/relatorio")
public class RelatorioController {
	

    private final RelatorioService service;


    public RelatorioController(RelatorioService service) {
        this.service = service;
    }

    @GetMapping("/mensal")
    public Map<String, Object> gerarRelatorio(
            @RequestParam int mes,
            @RequestParam int ano) {

        return service.gerarRelatorio(mes, ano);
    }

}
