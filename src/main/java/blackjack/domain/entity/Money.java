package blackjack.domain.entity;

public final class Money {

    private final int amount;

    private Money(final int amount) {
        validate(amount);
        this.amount = amount;
    }