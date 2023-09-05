package com.cursochat.dtos;

import com.cursochat.data.User;

public record ChatMessage(User from, User to, String text) {
}
