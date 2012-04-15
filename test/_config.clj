{
 ;; directory setting
 :public-dir   "public/"
 :template-dir "template/"
 :post-dir     "_posts/"
 :layout-dir   "_layouts/"

 ;; default site data
 :site {:default-title "default title"}

 :tag-layout "tag.test"
 :tag-out-dir "tag/"

 ;; templates which compiled with post data
 :compile-with-post ["gen_test.html.clj"]

 :post-filename-regexp #"(\d{4})[.](\d{1,2})[.](\d{1,2})[-_](.+)$"

 ;; highlight setting
 :code-highlight {:CLJ "lang-clj"}
 }

