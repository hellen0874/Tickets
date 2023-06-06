package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TicketTest {
    @Test
    public void ShouldSortOnPrice() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("SPb", "Msk", 600, 12, 14);
        Ticket ticket2 = new Ticket("SPb", "Msk", 300, 12, 14);
        Ticket ticket3 = new Ticket("Msk", "SPb", 500, 19, 21);
        Ticket ticket4 = new Ticket("NY", "Msk", 600, 12, 14);
        Ticket ticket5 = new Ticket("NY", "SPb", 450, 15, 17);
        Ticket ticket6 = new Ticket("SPb", "Msk", 500, 12, 14);
        Ticket ticket7 = new Ticket("SPb", "Msk", 800, 14, 16);
        Ticket ticket8 = new Ticket("SPb", "Msk", 700, 21, 23);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);

        Ticket[] expected = {ticket2, ticket6, ticket1, ticket8, ticket7};
        Ticket[] actual = aviaSouls.search("SPb", "Msk");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldSortTimeWithComparator() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("SPb", "Msk", 600, 12, 14); // 2 ч., № 1
        Ticket ticket2 = new Ticket("SPb", "Msk", 300, 12, 17); // 5 № 3
        Ticket ticket3 = new Ticket("Msk", "SPb", 500, 19, 23); // 4
        Ticket ticket4 = new Ticket("NY", "Msk", 600, 12, 15); // 3
        Ticket ticket5 = new Ticket("NY", "SPb", 450, 15, 17); // 2
        Ticket ticket6 = new Ticket("SPb", "Msk", 500, 12, 18); // 6 № 5
        Ticket ticket7 = new Ticket("SPb", "Msk", 800, 14, 19); // 5 № 4
        Ticket ticket8 = new Ticket("SPb", "Msk", 700, 20, 23); // 3 № 2
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket1, ticket8, ticket2, ticket7, ticket6};
        Ticket[] actual = aviaSouls.search("SPb", "Msk", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

}
