/*
 * Copyright (c) 2012 Johny Mattsson
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the
 *   distribution.
 * - Neither the name of the copyright holders nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL
 * THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */

module HplAtm2560SpiC
{
  provides
  {
    interface AsyncStdControl;
    interface HplAtm2560Spi;
  }
}
implementation
{
  async command error_t AsyncStdControl.start ()
  {
    call HplAtm2560Spi.enableSpi ();
    return SUCCESS;
  }

  async command error_t AsyncStdControl.stop ()
  {
    call HplAtm2560Spi.disableInterrupt ();
    call HplAtm2560Spi.disableSpi ();
    return SUCCESS;
  }

  async command void HplAtm2560Spi.enableSpi ()
  {
    SFR_SET_BIT(SPCR, SPE);
  }

  async command void HplAtm2560Spi.disableSpi ()
  {
    SFR_CLR_BIT(SPCR, SPE);
  }

  async command void HplAtm2560Spi.enableInterrupt ()
  {
    SFR_SET_BIT(SPCR, SPIE);
  }

  async command void HplAtm2560Spi.disableInterrupt ()
  {
    SFR_CLR_BIT(SPCR, SPIE);
  }

  async command bool HplAtm2560Spi.interruptPending ()
  {
    return SFR_BIT_SET(SPSR, SPIF);
  }

  async command void HplAtm2560Spi.setDataOrder (bool little_endian)
  {
    if (little_endian)
      SFR_SET_BIT(SPCR, DORD);
    else
      SFR_CLR_BIT(SPCR, DORD);
  }

  async command void HplAtm2560Spi.setMasterSlave (bool spi_master)
  {
    if (spi_master)
      SFR_SET_BIT(SPCR, MSTR);
    else
      SFR_CLR_BIT(SPCR, MSTR);

  }

  async command void HplAtm2560Spi.setClockPolarity (bool high_idle)
  {
    if (high_idle)
      SFR_SET_BIT(SPCR, CPOL);
    else
      SFR_CLR_BIT(SPCR, CPOL);
  }

  async command void HplAtm2560Spi.setClockPhase (bool sample_trailing)
  {
    if (sample_trailing)
      SFR_SET_BIT(SPCR, CPHA);
    else
      SFR_CLR_BIT(SPCR, CPHA);
  }

#define SPRx_bm 0x03

  async command void HplAtm2560Spi.setClockRate (atm2560_spi_clock_div_t rate)
  {
    SPCR = (SPCR & ~SPRx_bm) | rate;
  }

  async command void HplAtm2560Spi.setDoubleSpeed (bool spi2x)
  {
    if (spi2x)
      SFR_SET_BIT(SPSR, SPI2X);
    else
      SFR_CLR_BIT(SPSR, SPI2X);
  }

  async command bool HplAtm2560Spi.hasCollided ()
  {
    return SFR_BIT_SET(SPSR, WCOL);
  }

  async command void HplAtm2560Spi.write (uint8_t byte)
  {
    SPDR = byte;
  }

  async command uint8_t HplAtm2560Spi.read ()
  {
    return SPDR;
  }

  default async event void HplAtm2560Spi.transferComplete () {}

  AVR_ATOMIC_HANDLER(SPI_STC_vect)
  {
    signal HplAtm2560Spi.transferComplete ();
  }
}
