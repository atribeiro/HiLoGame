package com.funckygames.funkyhilo.model;

import funkyhilo.model.Card;
import funkyhilo.constants.Suit;
import funkyhilo.constants.Rank;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Anabela on 02/08/2015.
 */
public class CardTest {

    @Before
    public void steUpd()throws Exception{

    }

    @After
    public void tearDown()throws Exception{


    }

    @Test
    public void givenAValidRankAndSuitWhenCArdISCreatedThenGettersShouldMatchInputs() {
        Rank rank = Rank.DEUCE;
        Suit suit = Suit.CLUBS;

                Card card = new Card(rank, suit);

        Assert.assertEquals(rank,card.getRank());
        Assert.assertEquals(suit,card.getSuit());
        }
    }
