# Emil Nağıyev - Portfolio Website

## 📋 Layihə Haqqında

Bu, **Emil Nağıyev**-in şəxsi portfolio vebsaytıdır. Backend developer kimi bacarıqlarını, layihələrini və əlaqə məlumatlarını təqdim edən responsiv vebsayt.

## ✨ Xüsusiyyətlər

- **Responsiv Dizayn** - Bütün cihazlarda optimal görünüş
- **Hamar Skroll** - Navbar linkləri arasında hamar keçid
- **Form Göndərilməsi** - Əlaqə formunun interaktiv işləməsi
- **Layihə Detalları** - Hər layihə üçün ayrıca səhifə
- **Bacarıq Göstəriciləri** - Progress barlarla bacarıq səviyyələri

## 🛠 İstifadə Olunan Texnologiyalar

### Frontend
- **HTML5** - Struktur
- **CSS3** - Stil və dizayn
- **Bootstrap 5.3.0** - Responsiv framework
- **JavaScript** - İnteraktivlik
- **Font Awesome 6.4.0** - İkonlar

### Backend (Gələcək Planlar)
- **Java** - Əsas proqramlaşdırma dili
- **Spring Boot** - Veb framework
- **MySQL** - Verilənlər bazası
- **Thymeleaf** - Template engine

## 🚀 Qurulum və İstifadə

### Yerli Qurulum
1. Bütün faylları yükləyin
2. `index.html` faylını brauzerdə açın
3. Vebsayt hazırdır!

### Xüsusi Qurulum
1. Fayl yollarını öz server quruluşunuza uyğun dəyişdirin
2. Şəkilləri `uploads/images/` qovluğuna yerləşdirin
3. Öz məlumatlarınızı HTML fayllarında dəyişdirin

## 📄 Səhifələr

### Əsas Səhifə (main.html)
- **Hero Section** - Profil və əsas məlumatlar
- **Haqqımda** - Şəxsi məlumatlar və tərcümeyi-hal
- **Bacarıqlar** - Frontend və Backend bacarıqları
- **Layihələr** - Hazırladığım layihələr
- **Əlaqə** - Əlaqə formu və məlumatları

### Layihələr Səhifəsi (projects.html)
- StoreApp layihəsinin detallı təsviri
- Gələcək layihə planları
- Kod nümunələri
- Ekran görüntüləri

## 🎨 Dizayn Xüsusiyyətləri

- **Rəng Palitrası**: Bootstrap'un default rəng sxemi
- **Fontlar**: Sistem fontları (Bootstrap default)
- **Responsiv Breakpoints**: Bootstrap 5 breakpoint-ləri
- **Navbar**: Fixed top navbar
- **Cards**: Layihə və məlumat kartları

## 🔧 Fəaliyyət Göstərən JavaScript

### main.js
```javascript
// Form göndərilməsi
document.querySelector("form").addEventListener("submit", function (e) {
  e.preventDefault();
  alert("Mesajınız uğurla göndərildi!");
  this.reset();
});

// Hamar sürüşmə
document.querySelectorAll('a[href^="#"]').forEach((anchor) => {
  anchor.addEventListener("click", function (e) {
    e.preventDefault();
    document.querySelector(this.getAttribute("href")).scrollIntoView({
      behavior: "smooth",
    });
  });
});
```