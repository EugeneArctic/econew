package com.example.application.views.eco.pages

import com.example.application.views.MainLayout
import com.example.application.views.eco.service.mainStyle
import com.example.application.views.eco.service.mainVerticalLayout
import com.example.application.views.eco.service.menuLayout
import com.vaadin.flow.component.accordion.Accordion
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.html.Span
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route


@Route(value = "first", layout = MainLayout::class)
class FirstTopic:VerticalLayout() {

    init {

        this.mainStyle()
        defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER

        add(mainVerticalLayout().apply {
          val accordion = Accordion()
          val p1 = Paragraph("Recycling has become a big thing in almost every developed country today. Many people now understand that saving the world extends to making prudent use of available resources. While this is commendable, there are still some gray areas about understanding some things. And one of those gray areas is understanding what recyclable materials are.\n" +
                    "When it comes to recycling, not all materials will go into the recycling materials. This is because they are not fit to be there and are not recyclable. The ones that go into the recycling materials are the recyclable materials.\n" +
                    "But then, what do we mean when we say that some things are recyclable materials?\n" +
                    "In this post, you will get to know about that and other things. Particularly, we shall walk you through the list of materials that you can recycle. And finally, we will dive into the items that you cannot recycle.\n" +
                    "So, you see, you are in for a lot of things. What are you waiting for? Let’s get to it\n")

            accordion.add("What Are Recyclable Materials?", p1)

            val p2 = Paragraph("Recyclable materials are used or old materials that can be used to make some other materials. they are called recyclable materials because they can be recycled. They are capable of being used to make similar products. For instance, office papers can be used to make toilet paper. Hence, we can say office papers are recyclables.\n" +
                    "Anything that can serve as the source to make other things is called recyclable material. The materials that can be recycled are glass, aluminum, plastic water bottles, metal scrap, different kinds of paper, electronics –computers, cellular phones, keyboards, batteries and other small electronic equipment, textile, wood, wire, cables, plastic product, rubber, etc.\n" +
                    "For most of it, the things we use at home are recyclables materials. But, at the same time, not all things at home can be considered recyclable materials.\n" +
                    "Nonetheless, there might be times when what we consider recyclable materials would not be fit for recycling. For instance, if they are soiled with paints, chemicals, or oil. This is particularly the case for papers. In this instance, though they are recyclables materials, they can’t be recycled.\n" +
                    "On the other hand, nonrecyclables are the materials that you cannot put in the recycling materials. In simple terms, they cannot be made into other materials.\n" +
                    "We will get to see the list of recyclable and non-recyclable materials soon. First, let’s consider the effect of recycling materials on the environment.\n"
            )
            accordion.add("Recyclable Materials: Meaning?", p2 )

            val p3 = Paragraph("Recycling materials help the environment in many different ways. For recycling to have been well accepted among many people, it greatly benefits the users and the environment.\n"  +
                    "With regards to the environment, there are many ways recycling materials benefit it. Below, you will find some of those ways.  Let’s get to it.\n "
            )

            accordion.add("How Does Recycling Materials Help The Environment?", p3)

            val firstItem =Paragraph(
                    "Recycling materials are incredible approaches to moderate resources. For instance, when you recycle a few heaps of old magazines, you are by implication lessening the tension on trees. The old magazines would be reused to make other paper material things, consequently sparing trees along these lines.\n" +
                    "Producers slice down trees to get pulp utilized for papers. Taking all things together, the suggestion is that the more papers you reused, the more trees we will all have standing.\n" +
                    "In a similar vein, when you recycle tins or irons, you are chopping down mining pressure. Mining damagingly affects the climate. Thus, to spare the climate, we ought to reuse more metals.\n" +
                    "On the whole, recycling and recycling materials assist the world with moderating resources." )
            accordion.add("1. Preservation of Resources", firstItem)
            add(accordion)


            val secondItem =Paragraph(
                " You would concur that a ton of energy is coordinated for use when fabricating another item. This is an essential piece of creation. For example, when making paper, you would require the energy to ship yourself to cut trees. The machines utilized for cutting the trees would run on energy. You would require the energy to move the trees and recycle them. At that point, increasingly more energy till you at last bundle it and transport it to the store available to be purchased.\\n\" +\n" +
                        " Regularly, there is no different way to cut this energy. The main path is to cut the utilization of these papers and reuse those that have just been utilized. Thusly, lesser energy is utilized to reprocess these materials. For instance, specialists have assessed that one would be setting aside a lot of energy when recycling aluminumitems. This disclosure is a top dog and shows that we ought to reuse more.\\n\" +\n" +
                        " Thus, there it is. Recycling materials help assume a function in sparing the world’s energy. Furthermore, all things being equal, they are likewise dropping the measure of ozone-depleting substance from assembling another item."
                         )
            accordion.add("2. Saving of energy", secondItem)
            add(accordion)

            val thirdItem =Paragraph(
                "If you consider the two different ways we have talked about above, you should have the option to show up at this rapidly. Recycling assists with securing our valuable climate from multiple points of view. For example, in the event that you don’t throw your pre-owned plastic items in the recycling materials, you establish an issue for the climate. The plastic could wind up in the sea-going climate and could hurt the ocean creatures.\\n\" +\n" +
                        "Besides this, you are likewise ensuring the climate by recycling papers. Trees that paper is produced using help discharge energy into the climate and take in the harmful gases in the climate. This is the reason there have been various missions as of late to plant more trees."
            )
            accordion.add("3. Security of The Environment", thirdItem)
            add(accordion)


            val fourthItem =Paragraph(" You would concur that all old things would go into the trash if there were nothing called recyclable materials" +
                        " Old things in the recyclable materials, you decrease the substance that goes to the landfill. This aids the climate significantly. Landfills are known to possess an enormous territory of land and radiate hostile scents. Presently, envision if there were no recyclable materials. The suggestion is that you may very well have a landfill near your square since people need to discard stuff." +
                        "Likewise, materials that would have wound up in the landfills are spared. For example, when you put plastics in the recyclable materials, you are sparing the climate. On the off chance that plastics end up in the landfills, they will burn through many years prior to decomposing. In the event that they break down, they just decrease to microplastic, which influences the dirt as well.")

            accordion.add("4. Lessening Landfills Content", fourthItem)
            add(accordion)



            val firstSpan = Span("1. Aluminum cans\n" +
                    "are used for preserving or canned food. As they are in great use now, so they occupy a great part of the waste. Aluminum cans are quite easy to recycle. Recyclers only have to squash it, then melt it and finally make it into other materials.")

            val secondSpan = Span("2. Backpacks\n" +
                    "are often in cotton material or other materials. They can also be recycled.")

            val thirdSpan = Span("3. Batteries\n" +
                    "Whether phone batteries or your gadget’s batteries, they can be recycled. But your vehicle batteries cannot be recycled. In any way, only specialized recyclers handle the recycling of your batteries.\n" +
                    "\n")

            val fourSpan = Span("4. Bras" +"\n" + "don’t have to go to waste; they can also be recycled and made into other things.")

            val fiveSpan = Span("5. Cardboards are paper materials. You can always recycle them once they have no soil on them.")

            val sixSpan = Span("6. Cellphones contain vital materials that you can recycle. You have plastic, metal, aluminum, etc.")

            val sevenSpan = Span("7. Cereal boxes" +
                    "Your cereal boxes are paper materials with more fibers; you can also recycle them\n")

            val eightSpan = Span(  "8. Electronics\n" +
                    "In this world of technology where the gadgets are rapidly advancing and each new gadget has features different from the old ones, so people buy new gadget as soon as it appears in the market. The question arises: what to do with the old electronic?\n" +
                    "Electronics have some toxic and explosive matter in them and they have to be disposed of properly. So rather than throwing them, we should get them recycled and let their explosive matter be removed. All electronics like televisions, monitors, printers, keyboards, scanners, cell phones, fax machines, etc. can be recycled.\n" +
                    "Electronics is one of the major wastes in the country. But, you don’t have to worry too much, they can be recycled. Once you put them in the recycling bin, your problem is solved.\n")


            val nineSpan = Span(  "9. Coffee papers"  +
                    ", after using them, can also be recycled. After washing thoroughly, they can be made into other things")

            val tenSpan = Span(  " 10. Cosmetics." +
                    " You don’t have to worry about your cosmetics. You can always recycle them. All you have to do is put them in your recycling bin.")


            val bigSpanLayout = VerticalLayout(firstSpan, secondSpan, thirdSpan,fourSpan,fiveSpan,sixSpan,sevenSpan,eightSpan,nineSpan,tenSpan)
            bigSpanLayout.isSpacing = false
            bigSpanLayout.isPadding = false

            accordion.add("Ten Common Materials That Can be Easily Recycled",bigSpanLayout)



            add(accordion)

    }
        )
    }

}