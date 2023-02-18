package com.nttdata.bc.services;

import com.nttdata.bc.models.Client;

public interface IClientService extends ICRUD<Client, Integer> {

    public Client findByTypeAndNumDoc(String documentIdentityType, String documentIdentity);
}
