package com.blackalne.melgendy.jenkinsdemo

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MainPresenterTest {

  private lateinit var presenter: MainPresenter

  @Before
  fun setup(){

    presenter = MainPresenter()
  }

  @Test
  fun multiplyTest() {

    val res = presenter.multiply(4,6)
    Assert.assertEquals(res, 24)
  }
}