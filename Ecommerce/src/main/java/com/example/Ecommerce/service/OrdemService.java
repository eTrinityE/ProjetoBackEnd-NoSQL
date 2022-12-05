package com.example.Ecommerce.service;

import com.example.Ecommerce.dto.Transacao;
import com.example.Ecommerce.entidades.Cliente;
import com.example.Ecommerce.entidades.Ordem;
import com.example.Ecommerce.feign.DeliveryClient;
import com.example.Ecommerce.repositorios.ClienteRepsitory;
import com.example.Ecommerce.repositorios.OrdemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdemService {
    @Autowired
    OrdemRepository ordemRepository;

    @Autowired
    private DeliveryClient deliveryClient;

    @Autowired
    ClienteService clienteService;
    @Autowired
    ProdutosService produtosService;

    public List<Ordem> getAll(){
        return ordemRepository.findAll();
    }

    public Optional<Ordem> getById(String id){
        return ordemRepository.findById(id);
    }

    public Ordem create(Ordem ordem){
        return ordemRepository.save(ordem);
    }

    public Ordem update(Ordem ordem){
        if(ordem != null && !ordem.getId().isEmpty())
            return ordemRepository.save(ordem);
        return null;
    }

    public void delete(Ordem ordem){
        if(ordem != null && !ordem.getId().isEmpty())
            ordemRepository.delete(ordem);
    }

    public Ordem createOrdem(String idCliente, String idProduto, String endereco)
    {
        var cliente = clienteService.getById(idCliente).get();
        if(cliente != null)
        {
            var produto = produtosService.getById(idProduto).get();
            var ordem = new Ordem();
            ordem.setCliente(cliente);
            ordem.setProduto(produto);
            // uso do feign client para enviar uma solicitacao no workspace
            //testar delivery com /entrega/entregador no post
            // testar isso aq

            deliveryClient.saveTransaction(new Transacao(idCliente, cliente.getNome(), idProduto, produto.getPreco(),endereco));

            return create(ordem);
        }
        return null;
    }
}
