package com.cursochat.events;

public record Event<T>(EventType type, T payload) {
}
