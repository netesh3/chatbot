package com.example.application.views.chat;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.views.main.MainView;

@Route(value = "chat", layout = MainView.class)
@PageTitle("Chat")
public class ChatView extends Div {

    public ChatView() {
        setId("chat-view");
        add(new Text("Content placeholder"));
    }

}
