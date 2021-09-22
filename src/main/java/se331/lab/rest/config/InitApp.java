package se331.lab.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.entity.Bid;
import se331.lab.rest.repository.AuctionItemRepository;
import se331.lab.rest.repository.BidRepository;

import javax.transaction.Transactional;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    AuctionItemRepository auctionItemRepository;
    @Autowired
    BidRepository bidRepository;
    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        AuctionItem auctionItem01,auctionItem02,auctionItem03,auctionItem04,auctionItem05;
        Bid bid01,bid02,bid03,bid04,bid05,bid06,bid07,bid08,bid09,bid10,bid11,bid12,bid13,bid14,bid15;
        bid01 = bidRepository.save(Bid.builder()
                .amount(1).datetime("10/09/2020").build());
        bid02 = bidRepository.save(Bid.builder()
                .amount(2).datetime("11/09/2020").build());
        bid03 = bidRepository.save(Bid.builder()
                .amount(3).datetime("12/09/2020").build());
        bid04 = bidRepository.save(Bid.builder()
                .amount(4).datetime("13/09/2020").build());
        bid05 = bidRepository.save(Bid.builder()
                .amount(5).datetime("14/09/2020").build());
        bid06 = bidRepository.save(Bid.builder()
                .amount(6).datetime("15/09/2020").build());
        bid07 = bidRepository.save(Bid.builder()
                .amount(7).datetime("16/09/2020").build());
        bid08 = bidRepository.save(Bid.builder()
                .amount(8).datetime("17/09/2020").build());
        bid09 = bidRepository.save(Bid.builder()
                .amount(9).datetime("18/09/2020").build());
        bid10 = bidRepository.save(Bid.builder()
                .amount(10).datetime("19/09/2020").build());
        bid11 = bidRepository.save(Bid.builder()
                .amount(11).datetime("20/09/2020").build());
        bid12 = bidRepository.save(Bid.builder()
                .amount(12).datetime("21/09/2020").build());
        bid13 = bidRepository.save(Bid.builder()
                .amount(13).datetime("22/09/2020").build());
        bid14 = bidRepository.save(Bid.builder()
                .amount(14).datetime("23/09/2020").build());
        bid15 = bidRepository.save(Bid.builder()
                .amount(15).datetime("24/09/2020").build());

        auctionItem01 = auctionItemRepository.save(AuctionItem.builder().description("Water").type("Drink").build());
        bid01.setItem(auctionItem01);
        auctionItem01.getBids().add(bid01);
        auctionItem01.setSuccesfulBid(bid01);

        bid02.setItem(auctionItem01);
        auctionItem01.getBids().add(bid02);
        auctionItem01.setSuccesfulBid(bid02);

        bid03.setItem(auctionItem01);
        auctionItem01.getBids().add(bid03);
        auctionItem01.setSuccesfulBid(bid03);

        auctionItem02 = auctionItemRepository.save(AuctionItem.builder()
                .description("Noodle").type("Food").build());
        bid04.setItem(auctionItem02);
        auctionItem02.getBids().add(bid04);
        auctionItem02.setSuccesfulBid(bid04);

        bid05.setItem(auctionItem02);
        auctionItem01.getBids().add(bid05);
        auctionItem01.setSuccesfulBid(bid05);

        bid06.setItem(auctionItem02);
        auctionItem02.getBids().add(bid06);
        auctionItem02.setSuccesfulBid(bid06);

        auctionItem03 = auctionItemRepository.save(AuctionItem.builder()
                .description("Bread").type("Dessert").build());
        bid07.setItem(auctionItem03);
        auctionItem03.getBids().add(bid07);
        auctionItem03.setSuccesfulBid(bid07);

        bid08.setItem(auctionItem03);
        auctionItem03.getBids().add(bid08);
        auctionItem03.setSuccesfulBid(bid08);

        bid09.setItem(auctionItem03);
        auctionItem03.getBids().add(bid09);
        auctionItem03.setSuccesfulBid(bid09);

        auctionItem04 = auctionItemRepository.save(AuctionItem.builder()
                .description("Candy").type("Sweet").build());
        bid10.setItem(auctionItem04);
        auctionItem04.getBids().add(bid10);
        auctionItem04.setSuccesfulBid(bid10);

        bid11.setItem(auctionItem04);
        auctionItem04.getBids().add(bid11);
        auctionItem04.setSuccesfulBid(bid11);

        bid12.setItem(auctionItem04);
        auctionItem04.getBids().add(bid12);
        auctionItem04.setSuccesfulBid(bid12);
        
        auctionItem05 = auctionItemRepository.save(AuctionItem.builder()
                .description("Fired rice").type("Food").build());
        bid13.setItem(auctionItem05);
        auctionItem05.getBids().add(bid13);
        auctionItem05.setSuccesfulBid(bid13);

        bid14.setItem(auctionItem05);
        auctionItem05.getBids().add(bid14);
        auctionItem05.setSuccesfulBid(bid14);

        bid15.setItem(auctionItem05);
        auctionItem05.getBids().add(bid15);
        auctionItem05.setSuccesfulBid(bid15);

    }
}
