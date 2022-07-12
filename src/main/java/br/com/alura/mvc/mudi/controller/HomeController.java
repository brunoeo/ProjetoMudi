package br.com.alura.mvc.mudi.controller;

import java.security.Principal;
import java.util.List;

import br.com.alura.mvc.mudi.model.StatusPedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class HomeController {


	@Autowired
	PedidoRepository pedidoRepository;

	@GetMapping
	public String home(Model model){

		Sort sort = Sort.by("dataDaEntrega").descending();

		PageRequest paginacao = PageRequest.of(0, 10, sort);

		List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.ENTREGUE, paginacao);

		model.addAttribute("pedidos", pedidos);

		return "home";
	}

}
