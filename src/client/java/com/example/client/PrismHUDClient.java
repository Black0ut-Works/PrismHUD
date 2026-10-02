package com.example.client;

import net.fabricmc.api.ClientModInitializer;

public class PrismHUDClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("PrismHUD loaded!");
    }
}
