/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets.odyssey;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.common.ActivateOncePerTurnActivatedAbility;
import mage.abilities.costs.common.DiscardTargetCost;
import mage.abilities.effects.common.continious.BoostSourceEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Rarity;
import mage.constants.Zone;
import mage.target.common.TargetCardInHand;

/**
 *
 * @author cbt33
 */
public class PulsatingIllusion extends CardImpl<PulsatingIllusion> {

    public PulsatingIllusion(UUID ownerId) {
        super(ownerId, 96, "Pulsating Illusion", Rarity.UNCOMMON, new CardType[]{CardType.CREATURE}, "{4}{U}");
        this.expansionSetCode = "ODY";
        this.subtype.add("Illusion");

        this.color.setBlue(true);
        this.power = new MageInt(0);
        this.toughness = new MageInt(1);

        // Flying
        this.addAbility(FlyingAbility.getInstance());
        // Discard a card: Pulsating Illusion gets +4/+4 until end of turn. Activate this ability only once each turn.
        this.addAbility(new ActivateOncePerTurnActivatedAbility(Zone.BATTLEFIELD, new BoostSourceEffect(4, 4, Duration.EndOfTurn), new DiscardTargetCost(new TargetCardInHand())));
    }

    public PulsatingIllusion(final PulsatingIllusion card) {
        super(card);
    }

    @Override
    public PulsatingIllusion copy() {
        return new PulsatingIllusion(this);
    }
}