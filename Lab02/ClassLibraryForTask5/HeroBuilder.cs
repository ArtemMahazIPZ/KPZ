using System;
using System.Collections.Generic;

public class HeroBuilder : CharacterBuilder
{
    public HeroBuilder()
    {
        character = new Character();
    }

    public override CharacterBuilder SetName(string name)
    {
        character.Name = name;
        return this;
    }
    public override CharacterBuilder SetHeight(double height)
    {
        character.Height = height;
        return this;
    }

    public override CharacterBuilder SetBuild(string build)
    {
        character.Build = build;
        return this;
    }

    public override CharacterBuilder SetHairColor(string hairColor)
    {
        character.HairColor = hairColor;
        return this;
    }

    public override CharacterBuilder SetEyeColor(string eyeColor)
    {
        character.EyeColor = eyeColor;
        return this;
    }

    public override CharacterBuilder SetClothing(string clothing)
    {
        character.Clothing = clothing;
        return this;
    }

    public override CharacterBuilder SetInventory(List<string> inventory)
    {
        character.Inventory = inventory;
        return this;
    }
}
