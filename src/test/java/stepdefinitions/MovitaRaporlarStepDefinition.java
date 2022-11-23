package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class MovitaRaporlarStepDefinition extends ReusableMethods {

    MovitaPage movita = new MovitaPage();
//MQA-98-99

    @Then("kullanici kullanici adi ve sifre girecegi textboxlari görmeli")
    public void kullanici_kullanici_adi_ve_sifre_girecegi_textboxlari_görmeli() {
        movita.username_texbox_giris.isDisplayed();
        movita.password_texbox_giris.isDisplayed();
    }
    @Then("kullanici movita kullanici adini ve  gecerli sifresini girmeli")
    public void kullanici_movita_kullanici_adini_ve_gecerli_sifresini_girmeli() {
        movita.username_texbox_giris.sendKeys("demomovita");
        movita.password_texbox_giris.sendKeys("movita1192");
        movita.ilk_giris_yap.click();
    }
    @Then("kullanici acilan ekranda raporlar sekmesini görmeli")
    public void kullanici_acilan_ekranda_raporlar_sekmesini_görmeli() {
        movita.raporlar.isDisplayed();
    }
    @Then("kullanici raporlar secenegini tikla alt secenegi olan araca bazli raporlari tikla")
    public void kullanici_raporlar_secenegini_tikla_alt_secenegi_olan_araca_bazli_raporlari_tikla() throws InterruptedException {
        Thread.sleep(2000);
        movita.cizgi.click();
        movita.raporlar.click();
        Thread.sleep(2000);
        movita.arac_bazli_raporlar.click();
        Thread.sleep(2000);

    }
    @Then("ekranda iki ayri blog gormeli")
    public void ekranda_iki_ayri_blog_gormeli() throws IOException {
        movita.blog_1.isDisplayed();
        movita.blog12.isDisplayed();
    }
    @Then("kullanici gordugu iki blogun bottom ve height degerlerini almali")
    public void kullanici_gordugu_iki_blogun_bottom_ve_height_degerlerini_almali() {
        Dimension size=movita.blog11.getSize();
        Dimension size1=movita.blog12.getSize();

    }
    @Then("kullanici aldigi bloglarin degerlerini karsilastirip esitse degerler esittir mesajini almali")
    public void kullanici_aldigi_bloglarin_degerlerini_karsilastirip_esitse_degerler_esittir_mesajini_almali() {
        Dimension size=movita.blog11.getSize();
        Dimension size1=movita.blog12.getSize();
        if (size==size1){
            System.out.println("Boyutlar Eşittir.");
        }else System.out.println("Boyutlar Eşit Değildir.");
    }
    @Then("kullanici tum butonlar uzerinde hover over yapar")
    public void kullanici_tum_butonlar_uzerinde_hover_over_yapar() {
        ReusableMethods.hover(movita.rapor_al);
        ReusableMethods.hover(movita.Excel_);
        ReusableMethods.hover(movita.pdf_);
        ReusableMethods.hover(movita.print);
        ReusableMethods.hover(movita.detayli_filtre);
        ReusableMethods.hover(movita.onceki);
        ReusableMethods.hover(movita.sonraki);

    }
    @Then("tum butonlarin tiklanabilir oldugunu gormeli")
    public void tum_butonlarin_tiklanabilir_oldugunu_gormeli() {
        ReusableMethods.waitForClickablility(movita.rapor_al,5);
        ReusableMethods.waitForClickablility(movita.Excel_,5);
        ReusableMethods.waitForClickablility(movita.pdf_,5);
        ReusableMethods.waitForClickablility(movita.print,5);
        ReusableMethods.waitForClickablility(movita.detayli_filtre,5);
        ReusableMethods.waitForClickablility(movita.onceki,5);
        ReusableMethods.waitForClickablility(movita.sonraki,5);
    }
    @Then("Arac secme dropboxunda gecerli bir arac ve  tarih araligi secilmeli")
    public void arac_secme_dropboxunda_gecerli_bir_arac_ve_tarih_araligi_secilmeli() throws InterruptedException {


        movita.bos.click();
        movita.tarih_1.clear();
        movita.tarih_1.sendKeys("2015-01-15");
        movita.bos.click();
        movita.tarih_2.clear();
        movita.tarih_2.sendKeys("2022-11-15");
        movita.bos.click();
        movita.arac_arrow.click();
        movita.secilen_arac.click();
        movita.rapor_al.click();
        Thread.sleep(5000);
    }
    @Then("acilan tabloda onceki ve sonraki butonlari aktif olmali tablo bos ise pasif olmali")
    public void acilan_tabloda_onceki_ve_sonraki_butonlari_aktif_olmali_tablo_bos_ise_pasif_olmali() {
        ReusableMethods.waitForClickablility(movita.onceki,2);
        ReusableMethods.waitForClickablility(movita.sonraki,2);
    }



}
