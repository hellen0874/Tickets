package ru.netology;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
public class TicketTest {
    @Test
    public void ShouldSortOnPrice() {
    AviaSouls manager = new AviaSouls();
    Ticket ticket1 = new Ticket("SPb", "Msk", 600, 12, 14);
        Ticket ticket2 = new Ticket("SPb", "Msk", 600, 12, 14);
        Ticket ticket3 = new Ticket("Msk", "SPb", 500, 19, 21);
        Ticket ticket4 = new Ticket("NY", "Msk", 600, 12, 14);
        Ticket ticket5 = new Ticket("SPb", "Msk", 450, 15, 17);
        Ticket ticket6 = new Ticket("SPb", "Msk", 600, 12, 14);
        Ticket ticket7 = new Ticket("SPb", "Msk", 600, 12, 14);
        Ticket ticket8 = new Ticket("SPb", "Msk", 600, 12, 14);

    }

}
