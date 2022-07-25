package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.UUID;

public class User {
    private Socket socket;
    private DataInputStream is;
    private DataOutputStream out;
    private String name;
    private UUID uuid;

    public User(Socket socket) throws IOException {
        this.socket = socket;
        this.out = new DataOutputStream(socket.getOutputStream());
        this.is = new DataInputStream(socket.getInputStream());
        this.uuid = UUID.randomUUID();
    }
}
/*
*  Решить и обосновать какие геттеры и сеттеры нужны классу User
*  Запретить отправку сообщения отправителю
*
* */