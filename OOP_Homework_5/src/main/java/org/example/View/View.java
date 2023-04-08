package org.example.View;

import org.example.Model.User;
import java.util.List;

public class View {
    public String studentView(List<User> students) {
        StringBuilder sb = new StringBuilder();
        for (User s : students) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
}