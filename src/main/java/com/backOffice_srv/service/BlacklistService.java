package com.backOffice_srv.service;

import com.backOffice_srv.VO.Client;
import com.backOffice_srv.modele.Blacklist;

import java.util.List;

public interface BlacklistService {
    Blacklist addToBlacklist(Blacklist client);

    List<Blacklist> getBlacklist(Integer page);

    Blacklist checkClientINBlacklist(Blacklist client);

    Integer deleteFromBlacklist(Integer id);

    Integer countBlacklist();

    Client getClientbyCIN(String cin);

    Blacklist getClientbyPH(String ph);
}
