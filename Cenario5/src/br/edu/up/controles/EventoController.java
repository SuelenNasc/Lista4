package br.edu.up.controles;

import java.util.ArrayList;

public class EventoController {
    private ArrayList<Evento> eventos;
    private EventoView eventoView;

    public EventoController(EventoView eventoView) {
        this.eventos = new ArrayList<>();
        this.eventoView = eventoView;
    }

    public void incluirEvento() {
        Evento evento = eventoView.criarEvento();
        eventos.add(evento);
    }

    public void listarEventos() {
        eventoView.listarEventos(eventos);
    }
}

