package com.frederico.api.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frederico.api.model.DadosPagamento;

@RestController
@RequestMapping("/v1/public/auditoria")
public class AuditoriaResource {
	
	private static List<String> logs = new ArrayList<String>();
	
	@PostMapping()
	public ResponseEntity<Boolean> processaAuditoria(@RequestBody DadosPagamento pagamento) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Foi débitado do cartão ")
			.append(pagamento.getNumeroCartao())
			.append(" pertencente ao usuário ")
			.append(pagamento.getUsuario())
			.append(" um valor de ")
			.append(pagamento.getValorDebito());
		
		logs.add(builder.toString());
		
		return ResponseEntity.status(HttpStatus.OK).body(new Boolean(true));
	}
	
	@GetMapping()
	public List<String> verificaAuditoria() {
		
		return logs;
	}

}
