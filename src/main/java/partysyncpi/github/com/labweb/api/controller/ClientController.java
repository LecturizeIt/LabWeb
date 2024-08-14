package partysyncpi.github.com.labweb.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import partysyncpi.github.com.labweb.domain.model.Client;

@RestController
@RequestMapping("/api")
public class ClientController {

    @GetMapping("/client")
    @ResponseStatus(HttpStatus.OK)
    public Client getClient() {
        return new Client(1L, "Miralhas da Silva", "Casa dele");
    }
}
