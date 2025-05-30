/*
 * Copyright ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.besu.consensus.common.bft.statemachine;

import org.hyperledger.besu.consensus.common.bft.events.BftReceivedMessageEvent;
import org.hyperledger.besu.consensus.common.bft.events.BlockTimerExpiry;
import org.hyperledger.besu.consensus.common.bft.events.NewChainHead;
import org.hyperledger.besu.consensus.common.bft.events.RoundExpiry;

/** The interface Bft event handler. */
public interface BftEventHandler {

  /** Start. */
  void start();

  /** Stop. */
  void stop();

  /**
   * Handle message event.
   *
   * @param msg the msg
   */
  void handleMessageEvent(BftReceivedMessageEvent msg);

  /**
   * Handle new block event.
   *
   * @param newChainHead the new chain head
   */
  void handleNewBlockEvent(NewChainHead newChainHead);

  /**
   * Handle block timer expiry.
   *
   * @param blockTimerExpiry the block timer expiry
   */
  void handleBlockTimerExpiry(BlockTimerExpiry blockTimerExpiry);

  /**
   * Handle round expiry.
   *
   * @param roundExpiry the round expiry
   */
  void handleRoundExpiry(RoundExpiry roundExpiry);
}
